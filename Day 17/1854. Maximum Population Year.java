class Solution {
    public int maximumPopulation(int[][] logs) {
         int a = logs.length;
        int size = a*2;
        int[] arr_year = new int[size];
        int[] arr_pop = new int[size];
        int o = 0;
        for(int i=0;i<logs.length;i++)
        {
            for(int j=0;j<logs[i].length;j++)
            {
                 int year = logs[i][j];
                 arr_year[o] = year;
                int pop = checkPopulation(logs,year);
                arr_pop[o] = pop;
                  o++;
                
                
            }
        }
        //System.out.println(Arrays.toString(arr_year));
        // System.out.println(Arrays.toString(arr_pop));
        int max = arr_pop[0];
        for(int x:arr_pop)
        {
            if(x>max)
            {
                max = x;
            }
        }
        int occur=0;
        for(int x:arr_pop)
        {
            if(x==max)
            {
                occur++;
            }
        }
        if(occur==1)
        {
            for(int i=0;i<arr_pop.length;i++)
            {
                if(max==arr_pop[i])
                {
                    return arr_year[i];
                }
            }
        }
        else
        {
             int comp=-1;
             int c = 1;
             for(int i=0;i<arr_pop.length;i++)
            {
                if(max==arr_pop[i] && c==1)
                {
                    comp = arr_year[i];
                    c++;
                }
                if(max==arr_pop[i])
                {
                    if(arr_year[i]<comp)
                    {
                        comp = arr_year[i];
                    }
                }
            }
            return comp;
        }
        return -1;
    }
     public static int checkPopulation(int[][] arr, int num)
    {
        int val = 0;
        for(int i=0;i<arr.length;i++)
        {
            int j = 0;
            if(num>= arr[i][j] && num<arr[i][j+1])
            {
               val++; 
            }
        }
        return val;
    }
    
}
