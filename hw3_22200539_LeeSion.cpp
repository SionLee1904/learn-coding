#include <iostream>
#include <string>
#define SIZE 100

using namespace std;

class op_stack {
    private:
    char s[SIZE];
    int top;

    public:
    op_stack();
    void push(char x);
    char pop();
    bool empty();
    char top_element();   
};

op_stack::op_stack(){
    top=0;
}

bool is_palindrome(string& word);

int main() {
    string word;
   
    cin >> word;

    if (is_palindrome(word)) {
        cout << "Yes, it is a palindrome." << endl;
    } 
    else {
        cout << "No, It is not a palindrome." << endl;
    }

    return 0;
}

void op_stack::push(char x){
    s[top]=x;
    top++;
}

char op_stack::pop(){
    top--;
    return (s[top]);
}

bool op_stack::empty(){
    return (top==0);
}

char op_stack::top_element(){
    return (s[top-1]);
}

bool is_palindrome(string& word) {
    int n = word.length();
    op_stack stack;
   
    for (int i = 0; i < n / 2; i++) {
        stack.push(word[i]);
    }
   
    int start = (n % 2 == 0) ? n / 2 : n / 2 + 1;  
    for (int i = start; i < n; i++) {
        if (word[i] != stack.pop()) {
            return false;  
        }
    }

    return true;  
}