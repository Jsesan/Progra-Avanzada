package Matrices;

public class Main {

	public static void main(String[] args) {
		int m[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}},a;
		System.out.println("Matriz m: ");
		MostrarMatrizEntera(m);
		a=CSumaAnterioresDiagPrinc(m);
		if(CMultNula(m))
			System.out.println("Se verifica la Multiplicacion Nula");
		else
			System.out.println("NO se verifica la Multiplicacion Nula");
		int m1[][]=SumaElemAdyMat(m);
		System.out.println("Matriz Suma de adyacentes: ");
		MostrarMatrizEntera(m1);
		int modafila[]=ModaxFilaDeMat(m);
		System.out.print("Vector Moda: ");
		MostrarVectorEntero(modafila);
		System.out.println("Diagonales: ");
		ObtenerDiagonales(m);
	}
	
	public static void MostrarMatrizEntera(int m[][]) {
		for(int x=0; x < m.length; x++) {
			for(int y=0; y < m[x].length; y++) {
				System.out.print(m[x][y]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void MostrarVectorEntero(int v[]) {
		for(int x=0; x < v.length; x++) {
			
				System.out.print(v[x]);
				System.out.print(" ");
		}
		System.out.println();
	}
	
	public static int CSumaAnterioresDiagPrinc(int m[][]) {  //La C significa que este es un metodo que COMPRUEBA
		int sum=0;
		if(m.length != m[0].length)//Es un metodo solo para matrices cuadradas
		{
			System.out.println("ERROR este metodo es para matrices cuadradas");
			return -1;//Retorna ERROR
		}
		for (int x=0; x < m.length; x++) {
			  for (int y=0; y < m[x].length; y++) {
					if((x==y && (x!=0 && y!=0)) && sum!=m[x][y])//Condicion necesaria para que la comprobacion sea FALSA
				    {
				    	System.out.println("La matriz NO cumple la condicion de la suma de anteriores en la DP");
				    	return 0;//Retorna FALSO
				    }
					if(x==y)//Si la condicion anterior fue falsa se acumula para comprobar el sig elemento de la DiagPrin
						sum+=m[x][y];
			  }
			}
		System.out.println("La matriz cumple con la condicion de la suma de anteriores en la DP");//Si llego aca significa que la Diag Principal CUMPLE la condicion
		return 1;//Retorna VERDADERO
	}
	
	public static boolean CMultNula(int m[][]) { //La C significa que este es un metodo que COMPRUEBA
		for(int x=0; x < m.length; x++) {
			for(int y=0; y < m[x].length; y++) {
				if(m[x][y]==0) //Si algun elemento de la matiz es 0 se verifica la condicion
					return true;
			}
		}
		return false;
	}
	
	public static int[][] SumaElemAdyMat(int m[][] ){
		int aux[][]= new int[m.length][m[0].length];
		
		for(int x=0; x < m.length; x++) {
			for(int y=0; y < m[x].length; y++) {
				if(y-1>=0)
					aux[x][y]=m[x][y-1];
				if(x-1>=0)
					aux[x][y]+=m[x-1][y];
				if(y+1<m[x].length)
					aux[x][y]+=m[x][y+1];
				if(x+1<m.length)
					aux[x][y]+=m[x+1][y];
				aux[x][y]+=m[x][y];
			}
		}
		return aux;
	}
	
	public static int[] ModaxFilaDeMat(int m[][]) {
		int moda[]= new int[m.length];
		
		for(int x=0; x < m.length; x++) {
			int maxreps=0;
			for(int y=0; y < m[x].length; y++) {
				int reps=0;
				for(int z=0; z<m[x].length;z++) {
					if(m[x][y]==m[x][z])
						reps++;
				}
				if(reps>maxreps) {
					moda[x]=m[x][y];
					maxreps=reps;
				}
					
				if(reps==maxreps && m[x][y]>moda[x])
					moda[x]=m[x][y];
			}
		}
		return moda;
	}
	
	public static void ObtenerDiagonales(int m[][]) {
		int Xcoor=m.length-1,Ycoor=0,x=Xcoor,y=Ycoor;
		while(x>=0 && y<=m[x].length-1)
		{
			System.out.print(m[x][y]);
			System.out.print(" ");
			if(x+1>(m.length-1) || y+1>(m.length-1)) {
				System.out.println();
				if(Xcoor>0)
				{
					Xcoor--;
					x=Xcoor;
					y=Ycoor;
				}
				else
				{
					Ycoor++;
					y=Ycoor;
					x=Xcoor;
				}
			}
			else
			{
				x++;
				y++;
			}
		}
	}
}

