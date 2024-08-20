#include <iostream>
using namespace std;
class Perro
{
    private:
    string nombre;
    public:
    Perro() //Constructor por defecto. Es un método o función que no tiene tipo de dato
            // su nombre es el de la clase y no tiene Parámetros o Argumentos, los paréntesi están vacíos
    {
        cout<<"Constructor por defecto)"<<endl;
    }
    Perro(string nom)// Constructor Sobrecargado. Es un método o función que no tiene tipo de dato
                     // su nombre es el de la clase y  tiene Parámetros o Argumentos entre los paréntesis.
                     // En este caso el parámetro recibido nom contiene el nombre del perrito y el Constructor lo
                     // asignará al atributo nombre. No es necesario en este caso usar el setter.
    {
        cout<<"Constructor Sobrecargado"<<endl;
        this->nombre=nom; //Se iniializa el atributo nombre
    }
    void setNombre(string nom) //En este programa no se usa, lo reemplaza
                               //el Constructor sobrecargado
    {
       this->nombre=nom;
    }
    string getNombre()
    {
        return this->nombre;
    }
    void ladrar()
    {
       //Decir Guau Guau Guau
    	cout<<"Guau Guau Guau"<< endl;
    }
 };

     int main()
     {
		string nomb;
		cout<< "Ingrese el nombre del perro: ";
		cin>>nomb;

        Perro perrito= Perro(nomb);//Crea al objeto perrito y el Constructor Sobrecargado
                                   //pondrá el nombre en el atributo nombre del Objeto

        //Si no hubiéramos entrado el nombre por teclado
		//se podría haber programado así: Perro perrito= Perro("Spike");

		cout<<perrito.getNombre();// mensaje para obtener atributo nombre del objeto perrito
		cout<< " ladra"<<endl;
		perrito.ladrar(); //Mensaje para que el objeto perrito para que ladre
        return 0;
      }
