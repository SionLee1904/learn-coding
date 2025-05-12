#include <iostream>
using namespace std;

class weight {
    int kg;
    int gram;

    public:
    void set_weight(int n1, int n2);
    int get_weight();
    int is_heavy();
    void add_grams(int i);
};

weight add_weight(weight w1, weight w2);

int main() {
    weight w1, w2, w3;

    w1.set_weight(12, 800);

    if (w1.is_heavy()) {
        cout << "Heavy.\n";  
    } 
    else {
        cout << "Light.\n"; 
    }

    w2.set_weight(2, 900);

    w2.add_grams(500);

    w3 = add_weight(w1, w2);

    cout << w3.get_weight() << " grams\n";

    return 0;
}

void weight::set_weight(int n1, int n2) {
    kg = n1;
    gram = n2;
}

int weight::get_weight() {
    return (kg * 1000 + gram);  
}

int weight::is_heavy() {
    if(kg>=10) return 1;
    else return 0; 
}

void weight::add_grams(int i) {
    gram += i;  
    if (gram >= 1000) {
        kg += gram / 1000;    
        gram = gram % 1000;    
    }
}

weight add_weight(weight w1, weight w2) {
    weight tmp;
    int n;
    n = w1.get_weight() + w2.get_weight();  
    tmp.set_weight(n / 1000, n % 1000);  
    return tmp;  
}