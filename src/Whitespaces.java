class Whitespaces
{
    public static void main(String[] args)
    {
        String str = "I am Anuradha      I love chocltaes     ";

        //1. Using replaceAll() Method

        String strWithoutSpace = str.replaceAll("\\s", "");

        System.out.println(strWithoutSpace);         //Output : CoreJavajspservletsjdbcstrutshibernatespring

        //2. Without Using replaceAll() Method

        char[] strArray = str.toCharArray();

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < strArray.length; i++)
        {
            if( (strArray[i] != ' ') && (strArray[i] != '\t') )
            {
                sb.append(strArray[i]);
            }
        }

        System.out.println(sb);           //Output : CoreJavajspservletsjdbcstrutshibernatespring
    }
}