package ejerciciospropuestos;
public class Persona {
    private String nombre = "";
    private int edad = 0;
    private String id;
    private char sexo='H';
    private float peso=0, altura=0;
    private void comprobarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = sexo;
        }
    }
    private void generarId() {
        final int divisor = 23;
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);
        char letraDNI = generaLetraDNI(res);
        id = Integer.toString(numDNI)+letraDNI;
    }
 
    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
 
        return letras[res];
    }
    public Persona(String nombre,int edad, char sexo, float peso, float altura, int id){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.id = id;
        this.peso=peso;
        this.altura=altura;
    }
public static int calcularIMC(float peso,float altura){
    int resul, r = 0;
    resul=(int) (peso/(altura*altura));
    if (resul<20){
        r= -1;
    }
    else if(resul>=20 && resul <=25){
        r =0;
    }
    else if(resul>25){
        r= 1;
    }
        return r;
    }
public static boolean esMayorDeEdad(int edad){
    boolean b= false;
    if(edad>=18){
        b=true;
    }
        return b;
}
public String toString(){
    String mostrar ="La persona se llama "+nombre+","+" identificada con el numero "+id+", tiene "+edad+" años,"+" pesa "+peso+" kgs,"+" su altura es de "+altura+", y es de sexo   "+sexo;
    return mostrar;
}
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
