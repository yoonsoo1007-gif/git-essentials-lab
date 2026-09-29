package library;

public class LoanPolicy {
    public int loanDays() { return 14; }
    public int overdueFee(int daysLate) { return daysLate <= 0 ? 0 : daysLate * 100; }
    public int maxBooks(MemberType type) { return type == MemberType.STUDENT ? 3 : 5;
    }
}
