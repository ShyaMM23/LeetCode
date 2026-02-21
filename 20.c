bool isValid(char* s) {
    int len = strlen(s);
    if (len % 2!= 0){
        return false;
    }
    char* stack = (char*)malloc(len);
    int top = -1;
    for (int i = 0; i < len; i++) {
        if (s[i] == '(' || s[i] == '{' || s[i] == '[') {
            stack[++top] = s[i];
        } 
        else {
            if (top == -1) {
                free(stack);
                return false;
            }
            char topChar=stack[top--];
            if ((s[i] == ')' && topChar != '(') ||(s[i] == '}' && topChar != '{') ||(s[i] == ']' && topChar != '[')) 
            {
                free(stack);
                return false;
            }
        }
    }   
    free(stack);
    return top == -1;
}
