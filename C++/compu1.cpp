#include <iostream>
#include <string>
using namespace std;
class Hdd1{
private:
    int controlador;
    char disco;
public:

    Hdd1(int con, char disc){
        this-> disco = disc;
        cout<<"se creo el disco "<<this->disco<<endl;
        system("pause");
        this-> controlador = con;
        cout<<"se creo el controlador "<<this->controlador<<endl;
        system("pause");
    }
};

class Consola{
private:
    string pantalla;
    string teclado;
public:

    void setpantalla(string _pal){
        pantalla=_pal;
        cout<<"se creo pantalla "<<pantalla<<endl;
            system("pause");
    }

    void setteclado(string _tecl){
        teclado=_tecl;
        cout<<"se creo teclado "<<teclado<<endl;
            system("pause");
    }

    string getpantalla(){
        return pantalla;
    }

    string getteclado(){
        return teclado;
    }

    Consola(){
    }
    /*Consola(string panta, string tecl){
        pantalla=panta;
        cout<<"se creo la pantalla"<<endl;
        system("pause");
        teclado=tecl;
        cout<<"se creo el teclado \n"<<endl;
    }*/
};

class Computadora{
    public:
        Hdd1 disco=Hdd1(1, 'H');
        Consola cosa;
        Computadora(){
        }
};

int main(){
    Computadora compu1=Computadora();
    compu1.cosa.setpantalla("pan1");
    compu1.cosa.setteclado("tecl1");
    cout<<"tu compu esta creada de forma god \n"<<endl;
}
