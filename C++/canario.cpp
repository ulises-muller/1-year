#include <iostream>
#include <string>
using namespace std;
class Gato
{
    private:
    string nombre;
    string color;
    int edad;
    public:
    void setnombre(string nom){
        nombre=nom;
    }
    void setcolor(string col){
        color=col;
    }
    void setedad(int eda){
        edad=eda;
    }

    string getcolor(){
    return color;
    }

    string getnombre(){
    return nombre;
    }

    int getedad(){
    return edad;
    }

    void trepar(){
        cout<<getnombre()<<" trepa"<<endl;
    }

    void maullar(){
        cout<<getnombre()<<" maulla"<<endl;
    }

    Gato(string nom, string col, int eda)
    {
    setnombre(nom);
    cout<<"Su nombre es "<<getnombre()<<endl;
    system("pause");
    setcolor(col);
    cout<<"Su color es "<<getcolor()<<endl;
    system("pause");
    setedad(eda);
    cout<<"Su edad es de "<<getedad()<<" anios"<<endl;
    system("pause");
    maullar();
    system("pause");
    trepar();
    }
};
int main()
{
    Gato gatito=Gato("Robert","naranja", 3);
};