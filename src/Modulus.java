public class Modulus {
    static void sortArrayByParity(int[] A) {

        int eveniter=0;
        for(int j=0;j<A.length;j++)
        {
            if(A[j]%2==0)
            {
                int temp=A[eveniter];
                A[eveniter]=A[j];
                A[j]=temp;
                //System.out.println(temp+" "+eveniter);
                eveniter++;
            }

        }
        for (int i=0; i<A.length; i++)
            System.out.print(A[i]+" ");
    }

    public static void main(String[] args)

    {

        int arr[] = {2,3,4,5};
        sortArrayByParity(arr);
    }



}

