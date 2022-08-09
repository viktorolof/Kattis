#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

int cols = 0; // public variables is a great coding practice

struct Position {
    int x, y;
};

struct Stack {
    int capacity;
    int size;
    struct Position *data;
};

void correct_pos(struct Position* p1, struct Position* p2);
int solve(int map[][cols], int *one_dim, int rows, int group);
bool check_positions(struct Position p1, struct Position p2);
struct Stack* init_stack(int cap, int s);
void stack_push(struct Stack *s, struct Position value);
struct Position stack_pop(struct Stack *s);
void copy_position(struct Position* p1, struct Position p2);
bool pos_in_range(struct Position p, int rows);
void stack_destroy(struct Stack *s);

int main(void) {
    int rows;
    int testcases;

    scanf("%d%d", &rows, &cols);

    int map[rows][cols];
    char nothing;
    int group = 1;
    
    for(int i = 0 ; i < rows ; i++) {
        scanf("%c", &nothing);
        for(int j = 0 ; j < cols ; j++) {
          scanf("%lc", &map[i][j]);
          map[i][j] -= 48;
        }
    }

    int *one_dim_map = (int *)calloc(rows * cols, sizeof(int));

    scanf("%d", &testcases);
    
    for(int i = 0 ; i < testcases ; i++) {
        int result = solve(map, one_dim_map, rows, group);

        group++; // kanske fel?
        if(result == 1) {
            printf("decimal\n");
        } else if(result == 0) {
            printf("binary\n");
        } else {
            printf("neither\n");
        }
    } 
}

void correct_pos(struct Position* p1, struct Position* p2) {
    p1->x -= 1;
    p1->y -= 1;
    p2->x -= 1;
    p2->y -= 1;
}

int solve(int map[][cols], int *one_dim, int rows, int group) {
    /* Setup Variables */
    struct Position p1;
    struct Position p2;
    scanf("%d%d%d%d", &p1.y, &p1.x, &p2.y, &p2.x);
    correct_pos(&p1, &p2);
    struct Position currentpos;
    struct Stack* stack = init_stack(rows * cols, 0);
    int result = -1;
    int dec_or_bin = map[p1.y][p1.x];
    int dim_one_start = p1.y * cols + p1.x;
    int dim_one_end = p2.y * cols + p2.x;


    if(dim_one_start == dim_one_end) {
        return dec_or_bin;
    }

    if(one_dim[dim_one_start] == 0 && one_dim[dim_one_end] == 0) {
        stack_push(stack, p1);
        one_dim[p1.y * cols + p1.x] = group;

        while(stack->size > 0) {
            copy_position(&currentpos, stack_pop(stack));

            // 1 north, 2 east, 3 south, 4 west
            if(currentpos.y >= 1 && map[currentpos.y - 1][currentpos.x] == dec_or_bin && !one_dim[(currentpos.y - 1) * cols + currentpos.x]) {
                struct Position p ={currentpos.x, currentpos.y - 1};
                one_dim[(currentpos.y - 1) * cols + currentpos.x] = group; // visited
                stack_push(stack, p);
            }
            if(currentpos.x < cols - 1 && map[currentpos.y][currentpos.x + 1] == dec_or_bin && !one_dim[currentpos.y * cols + currentpos.x + 1]) {
                struct Position p ={currentpos.x + 1, currentpos.y};
                one_dim[currentpos.y * cols + currentpos.x + 1] = group; 
                stack_push(stack, p);
            }
            if(currentpos.y < rows - 1 && map[currentpos.y + 1][currentpos.x] == dec_or_bin && !one_dim[(currentpos.y +1) * cols + currentpos.x]) {
                struct Position p ={currentpos.x, currentpos.y + 1};
                one_dim[(currentpos.y +1) * cols + currentpos.x] = group;
                stack_push(stack, p);
            }
            if(currentpos.x >= 1 && map[currentpos.y][currentpos.x - 1] == dec_or_bin && !one_dim[currentpos.y * cols + currentpos.x - 1]) {
                struct Position p ={currentpos.x - 1, currentpos.y};
                one_dim[currentpos.y * cols + currentpos.x - 1] = group;
                stack_push(stack, p);
            }
        }

        if(one_dim[dim_one_end] > 0) {
            return dec_or_bin;
        } else {
            return -1;
        }
    }

    if(map[p1.y][p1.x] != map[p2.y][p2.x]) {
        return -1;
    }

    if(one_dim[dim_one_start] == one_dim[dim_one_end]) {
        return dec_or_bin;
    }

    stack_destroy(stack);
    return result;
}

bool pos_in_range(struct Position p, int rows) {
    return p.x < cols && p.y < rows;
}

bool check_positions(struct Position p1, struct Position p2) {
    return p1.x == p2.x && p1.y == p2.y;
}

struct Stack* init_stack(int cap, int si) {
    struct Stack *s = calloc(1, sizeof(struct Stack));
    s->capacity = cap;
    s->data = calloc(s->capacity, sizeof(struct Position));
    s->size = si;

    return s;
}

void stack_push(struct Stack *s, struct Position value) {
  s->data[s->size] = value;
  s->size++;
}

struct Position stack_pop(struct Stack *s) {
  s->size--;
  return s->data[s->size];
}

void copy_position(struct Position* p1, struct Position p2) {
    p1->x = p2.x;
    p1->y = p2.y;
}

void stack_destroy(struct Stack *s) {
  free(s->data);
  free(s);
}