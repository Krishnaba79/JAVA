#include <iostream>

class BaseA {
public:
    void methodA() {
        std::cout << "Method A implementation" << std::endl;
    }
};

class BaseB {
public:
    void methodB() {
        std::cout << "Method B implementation" << std::endl;
    }
};

class Derived : public BaseA, public BaseB {
public:
    void methodC() {
        std::cout << "Method C implementation" << std::endl;
    }
};

int main() {
    Derived obj;
    obj.methodA();
    obj.methodB();
    obj.methodC();

    return 0;
}
