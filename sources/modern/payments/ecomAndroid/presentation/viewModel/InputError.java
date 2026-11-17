package modern.payments.ecomAndroid.presentation.viewModel;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/InputError;", "", "msg", "", "(Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "IncorrectMonth", "IncorrectYear", "ShortCvv", "ShortDate", "ShortNumber", "Lmodern/payments/ecomAndroid/presentation/viewModel/InputError$IncorrectMonth;", "Lmodern/payments/ecomAndroid/presentation/viewModel/InputError$IncorrectYear;", "Lmodern/payments/ecomAndroid/presentation/viewModel/InputError$ShortCvv;", "Lmodern/payments/ecomAndroid/presentation/viewModel/InputError$ShortDate;", "Lmodern/payments/ecomAndroid/presentation/viewModel/InputError$ShortNumber;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class InputError {
    private final String msg;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/InputError$IncorrectMonth;", "Lmodern/payments/ecomAndroid/presentation/viewModel/InputError;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IncorrectMonth extends InputError {
        public static final IncorrectMonth INSTANCE = new IncorrectMonth();

        private IncorrectMonth() {
            super("Неверный месяц", null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof IncorrectMonth);
        }

        public int hashCode() {
            return 1046832890;
        }

        public String toString() {
            return "IncorrectMonth";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/InputError$IncorrectYear;", "Lmodern/payments/ecomAndroid/presentation/viewModel/InputError;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IncorrectYear extends InputError {
        public static final IncorrectYear INSTANCE = new IncorrectYear();

        private IncorrectYear() {
            super("Неверный год", null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof IncorrectYear);
        }

        public int hashCode() {
            return -1628451709;
        }

        public String toString() {
            return "IncorrectYear";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/InputError$ShortCvv;", "Lmodern/payments/ecomAndroid/presentation/viewModel/InputError;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShortCvv extends InputError {
        public static final ShortCvv INSTANCE = new ShortCvv();

        private ShortCvv() {
            super("Введите CVV код", null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ShortCvv);
        }

        public int hashCode() {
            return -713223002;
        }

        public String toString() {
            return "ShortCvv";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/InputError$ShortDate;", "Lmodern/payments/ecomAndroid/presentation/viewModel/InputError;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShortDate extends InputError {
        public static final ShortDate INSTANCE = new ShortDate();

        private ShortDate() {
            super("Введите срок действия карты", null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ShortDate);
        }

        public int hashCode() {
            return -635066933;
        }

        public String toString() {
            return "ShortDate";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/InputError$ShortNumber;", "Lmodern/payments/ecomAndroid/presentation/viewModel/InputError;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShortNumber extends InputError {
        public static final ShortNumber INSTANCE = new ShortNumber();

        private ShortNumber() {
            super("Неверный номер карты", null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ShortNumber);
        }

        public int hashCode() {
            return -109412826;
        }

        public String toString() {
            return "ShortNumber";
        }
    }

    public /* synthetic */ InputError(String str, gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    public final String getMsg() {
        return this.msg;
    }

    private InputError(String str) {
        this.msg = str;
    }
}
