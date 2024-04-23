
#include <iostream>
using namespace std;

class Person{
protected:
    string name;
    int age;
public:
    virtual void getdata()=0;
    virtual void putdata()=0;
};
class Professor:public Person{
public:
    int publications;
    static int countP;
    Professor(){
        countP++;
    }
    void getdata(){
        cin>>name>>age>>publications;
    };
    void putdata(){
        // cout<<"Prof name: "<<name<<", age: "<<age<<", "<<publications<<" , Count : "<<countP; 
        cout<<name<<" "<<age<<" "<<publications<<" "<<countP<<endl;
    }
};
int Professor::countP = 0;

class Student: public Person{
public:
    int marks[6];
    static int countS;
    Student(){
        countS++;
    }
    void getdata(){
        cin>>name>>age;
        int marks[6];
        int i=0;
        while(i<6){
            cin>>marks[i];
            i++;
        }
    };
    void putdata(){
        int sum=0, i=0;
        while(i<6){
            sum += marks[i];
            i++;
        }
        // cout<<"Student name: "<<name<<", age: "<<age<<", sum of marks: "<<sum<<cur_id;
        cout<<name<<" "<<age<<" "<<sum<<" "<<countS<<endl;
    }
};

int Student::countS = 0;

int main(){

    // Professor prof1;
    // prof1.getdata();
    // prof1.putdata();
    // cout<<endl;

    // Professor prof2;
    // prof2.getdata();
    // prof2.putdata();
    // cout<<endl;
    
    Student stu1;
    stu1.getdata();
    stu1.putdata();

    Student stu2;
    stu2.getdata();
    stu2.putdata();
    
    return 0;
}