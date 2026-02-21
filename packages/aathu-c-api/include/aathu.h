#ifndef AATHU_H
#define AATHU_H
#ifdef __cplusplus
extern "C" {
#endif
typedef struct AathuContext AathuContext;
AathuContext* aathu_context_new(void);
void aathu_context_free(AathuContext* ctx);
int aathu_eval(AathuContext* ctx, const char* source);
#ifdef __cplusplus
}
#endif
#endif
