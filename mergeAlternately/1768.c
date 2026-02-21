char * mergeAlternately(char * word1, char * word2){
    int n=strlen(word1); 
    int m=strlen(word2); 
    int r=n+m+1; 
    char *res=(char*)malloc(sizeof(char) *r);
    int i=0,j=0,k=0;
    while (i<n||j<m) {
        if(i<n) res[k++] = word1[i++];
        if(j<m) res[k++] = word2[j++];
    }
    res[k] = '\0';
    return res;
}
