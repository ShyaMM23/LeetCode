bool isHappy(int n) {
    int count = 0;
       while(n != 1)
        {
            int sum = 0;
            while(n != 0)
            {
                int num = n%10;
                sum += num*num;
                n/=10;
                count++;
            }
            n = sum;
            if(count > 31)
                return false;
        }
        if(n==1){
            return true;
        }
        else{
            return false;
        }
}
