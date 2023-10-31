package sem2;

import java.util.*;

public class Matrix {
    //member variables
    int row,column;
    int[][] matrix;

    //constructors
    Matrix(){
        row=0;column=0;
        matrix = new int[row][column];
    }
    Matrix(int a,int b){
        row=a;column=b;
        matrix=new int[row][column];
    }

    //member functions
    void readMatrix(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in the matrix:");
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.column;j++){
                this.matrix[i][j]=sc.nextInt();
            }
        }
    }

    void printMatrix(){
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.column;j++){
                System.out.print(this.matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    Matrix addMatrix(Matrix a)throws MatrixAdditionException{
        Matrix result=null;
        if(this.row==a.row&&this.column==a.column){
            result= new Matrix(this.row,this.column);
            for(int i=0;i<this.row;i++){
                for(int j=0;j<this.column;j++){
                    result.matrix[i][j]=this.matrix[i][j]+a.matrix[i][j];
                }
            }
        }else{
            // System.out.println("addition is not possible");
            throw new MatrixAdditionException();
        }
        return result;
        
    }

    Matrix multiplyMatrix(Matrix a)throws MatrixMultiplicationException {
        Matrix result = null;
        if(this.column==a.row){
            result = new Matrix(this.row, a.column);
            for(int i=0;i<this.row;i++){
                for(int j=0;j<a.column;j++){
                    for(int k=0;k<a.row;k++){
                        result.matrix[i][j]+=this.matrix[i][k]+a.matrix[k][j];
                    }
                }
            }
        }
        else{
            // System.out.println("matrix multiplication is NOT possible!!");
            throw new MatrixMultiplicationException();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the order of matrix 1");
        int r1=sc.nextInt(),c1=sc.nextInt();
        Matrix m1=new Matrix(r1,c1);
        System.out.println("enter the order of matrix 2");
        int r2=sc.nextInt(),c2=sc.nextInt();
        Matrix m2= new Matrix(r2,c2);
        System.out.println("for matrix 1");
        m1.readMatrix();
        System.out.println("for matrix 2");
        m2.readMatrix();
        do{
            System.out.print("1 Add \n 2 Multiply \n 3 Exit \n Enter your option: ");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                        try{
                            System.out.println("After adding, we get ");
                            m1.addMatrix(m2).printMatrix();
                        }catch(MatrixAdditionException ma){
                            System.out.println("Matrix addition exception is found");
                            ma.printStackTrace();
                        }catch(Exception e){
                            System.out.println("Unknown exception!");
                            e.printStackTrace();
                        }
                        break;
                case 2:
                        try{
                            System.out.println("After multiplication, we get");
                            m1.multiplyMatrix(m2).printMatrix();
                        }catch(MatrixMultiplicationException mme){
                            System.out.println("Matrix multiplication exception is found");
                            mme.printStackTrace();
                        }catch(Exception e){
                            System.out.println("Unknown exception!");
                            e.printStackTrace();
                        }
                        break;
                case 3:
                        System.out.println("Program Terminated Successfully.");
                        sc.close();
                        System.exit(0);
            }
        }while(true);
                
    }

}

class MatrixAdditionException extends Exception {
}
class MatrixMultiplicationException extends Exception{

}

