package modern.payments.ecomAndroid.presentation.viewModel;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent;", "", "()V", "OnCVVModifiedEvent", "OnCancelBntClickedEvent", "OnCardNumberModifiedEvent", "OnDateModifiedEvent", "OnNextBtnClickedEvent", "OnShortCardNumberClickedEvent", "Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent$OnCVVModifiedEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent$OnCancelBntClickedEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent$OnCardNumberModifiedEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent$OnDateModifiedEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent$OnNextBtnClickedEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent$OnShortCardNumberClickedEvent;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AddNewCardFragmentEvent {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent$OnCVVModifiedEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnCVVModifiedEvent extends AddNewCardFragmentEvent {
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnCVVModifiedEvent(String text) {
            super(null);
            zdlpuopuiu.btonecajqb(text, "text");
            this.text = text;
        }

        public static /* synthetic */ OnCVVModifiedEvent copy$default(OnCVVModifiedEvent onCVVModifiedEvent, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = onCVVModifiedEvent.text;
            }
            return onCVVModifiedEvent.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final OnCVVModifiedEvent copy(String text) {
            zdlpuopuiu.btonecajqb(text, "text");
            return new OnCVVModifiedEvent(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnCVVModifiedEvent) && zdlpuopuiu.eablkybsjg(this.text, ((OnCVVModifiedEvent) other).text);
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "OnCVVModifiedEvent(text=" + this.text + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent$OnCancelBntClickedEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnCancelBntClickedEvent extends AddNewCardFragmentEvent {
        public static final OnCancelBntClickedEvent INSTANCE = new OnCancelBntClickedEvent();

        private OnCancelBntClickedEvent() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OnCancelBntClickedEvent);
        }

        public int hashCode() {
            return 991837854;
        }

        public String toString() {
            return "OnCancelBntClickedEvent";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent$OnCardNumberModifiedEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnCardNumberModifiedEvent extends AddNewCardFragmentEvent {
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnCardNumberModifiedEvent(String text) {
            super(null);
            zdlpuopuiu.btonecajqb(text, "text");
            this.text = text;
        }

        public static /* synthetic */ OnCardNumberModifiedEvent copy$default(OnCardNumberModifiedEvent onCardNumberModifiedEvent, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = onCardNumberModifiedEvent.text;
            }
            return onCardNumberModifiedEvent.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final OnCardNumberModifiedEvent copy(String text) {
            zdlpuopuiu.btonecajqb(text, "text");
            return new OnCardNumberModifiedEvent(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnCardNumberModifiedEvent) && zdlpuopuiu.eablkybsjg(this.text, ((OnCardNumberModifiedEvent) other).text);
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "OnCardNumberModifiedEvent(text=" + this.text + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent$OnDateModifiedEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent;", "month", "", "year", "(Ljava/lang/String;Ljava/lang/String;)V", "getMonth", "()Ljava/lang/String;", "getYear", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnDateModifiedEvent extends AddNewCardFragmentEvent {
        private final String month;
        private final String year;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDateModifiedEvent(String month, String year) {
            super(null);
            zdlpuopuiu.btonecajqb(month, "month");
            zdlpuopuiu.btonecajqb(year, "year");
            this.month = month;
            this.year = year;
        }

        public static /* synthetic */ OnDateModifiedEvent copy$default(OnDateModifiedEvent onDateModifiedEvent, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = onDateModifiedEvent.month;
            }
            if ((i13 & 2) != 0) {
                str2 = onDateModifiedEvent.year;
            }
            return onDateModifiedEvent.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMonth() {
            return this.month;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getYear() {
            return this.year;
        }

        public final OnDateModifiedEvent copy(String month, String year) {
            zdlpuopuiu.btonecajqb(month, "month");
            zdlpuopuiu.btonecajqb(year, "year");
            return new OnDateModifiedEvent(month, year);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnDateModifiedEvent)) {
                return false;
            }
            OnDateModifiedEvent onDateModifiedEvent = (OnDateModifiedEvent) other;
            return zdlpuopuiu.eablkybsjg(this.month, onDateModifiedEvent.month) && zdlpuopuiu.eablkybsjg(this.year, onDateModifiedEvent.year);
        }

        public final String getMonth() {
            return this.month;
        }

        public final String getYear() {
            return this.year;
        }

        public int hashCode() {
            return (this.month.hashCode() * 31) + this.year.hashCode();
        }

        public String toString() {
            return "OnDateModifiedEvent(month=" + this.month + ", year=" + this.year + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent$OnNextBtnClickedEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnNextBtnClickedEvent extends AddNewCardFragmentEvent {
        public static final OnNextBtnClickedEvent INSTANCE = new OnNextBtnClickedEvent();

        private OnNextBtnClickedEvent() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OnNextBtnClickedEvent);
        }

        public int hashCode() {
            return 1189719801;
        }

        public String toString() {
            return "OnNextBtnClickedEvent";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent$OnShortCardNumberClickedEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnShortCardNumberClickedEvent extends AddNewCardFragmentEvent {
        public static final OnShortCardNumberClickedEvent INSTANCE = new OnShortCardNumberClickedEvent();

        private OnShortCardNumberClickedEvent() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OnShortCardNumberClickedEvent);
        }

        public int hashCode() {
            return 462485925;
        }

        public String toString() {
            return "OnShortCardNumberClickedEvent";
        }
    }

    public /* synthetic */ AddNewCardFragmentEvent(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private AddNewCardFragmentEvent() {
    }
}
