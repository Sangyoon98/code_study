#include <stdint.h>

typedef struct {
    int accNum;
    double bal;
} BankAcc;

double sim_pov(double base, int year) {
    int i;
    double r = 1.0;

    for (i = 0; i < year; i++) {
        r = r * base;
    }

    return r;
}

void initAcc(BankAcc *acc, int x, double y) {
    acc -> accNum = x;
    acc -> bal =y;
}

void update_balance(BanckAcc *acc, double *en) {
    if (*en > 0 && *en < acc -> bal) {
        acc -> bal = acc -> bal - *en;
    } else {
        acc -> bal = acc -> bal + *en;
    }
}

void apply_interest(BankAcc *acc) {
    acc -> bal = acc -> bal * sim_pov((1 + 0.1), 3);
}

int main() {
    BankAcc myAcc;
    initAcc(&myAcc, 9981, 2200.0);
    double amount = 100.0;
    update_balance(&myAcc, &amount);
    apply_interest(&myAcc);
    printf("%d and %.2f", myAcc.accNum, myAcc.bal);
    return 0;
}