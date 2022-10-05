class Solution {
    public int[] plusOne(int[] digits) {
        int carry =1;
        int i = digits.length-1;
        while(i>=0)
        {
            if(digits[i]==9)
            {
                if(carry==1)
                {
                    digits[i]=0;
                
                }
            i--;
            }
            else
            {
                if(carry==1)
                {
                    digits[i]=digits[i]+1;
                    carry = 0;
                    break;
                }
                i--;
            }
        }
            if (carry == 1)
            {
                int[] newMatrix = new int[digits.length+1];
                newMatrix[0]=1;
                for(int j =0;j<digits.length;j++)
                    newMatrix[j+1]=digits[j];
                
                return newMatrix;
            }
            
            return digits;
        }
       
    }