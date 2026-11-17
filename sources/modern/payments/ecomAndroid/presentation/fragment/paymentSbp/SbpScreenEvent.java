package modern.payments.ecomAndroid.presentation.fragment.paymentSbp;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.model.response.EcomSbpConfig;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent;", "", "BankItemClickEvent", "SearchInputChangeEvent", "SearchInputFocusChanged", "TryToOpenBankAppFailedEvent", "TryToOpenBankWebAppFailedEvent", "TryToOpenNspkBankUriFailedEvent", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent$BankItemClickEvent;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent$SearchInputChangeEvent;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent$SearchInputFocusChanged;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent$TryToOpenBankAppFailedEvent;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent$TryToOpenBankWebAppFailedEvent;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent$TryToOpenNspkBankUriFailedEvent;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SbpScreenEvent {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent$BankItemClickEvent;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent;", "bank", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;", "context", "Landroid/content/Context;", "(Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;Landroid/content/Context;)V", "getBank", "()Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;", "getContext", "()Landroid/content/Context;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BankItemClickEvent implements SbpScreenEvent {
        private final EcomSbpConfig.SbpBankInfo bank;
        private final Context context;

        public BankItemClickEvent(EcomSbpConfig.SbpBankInfo bank, Context context) {
            zdlpuopuiu.btonecajqb(bank, "bank");
            zdlpuopuiu.btonecajqb(context, "context");
            this.bank = bank;
            this.context = context;
        }

        public static /* synthetic */ BankItemClickEvent copy$default(BankItemClickEvent bankItemClickEvent, EcomSbpConfig.SbpBankInfo sbpBankInfo, Context context, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                sbpBankInfo = bankItemClickEvent.bank;
            }
            if ((i13 & 2) != 0) {
                context = bankItemClickEvent.context;
            }
            return bankItemClickEvent.copy(sbpBankInfo, context);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final EcomSbpConfig.SbpBankInfo getBank() {
            return this.bank;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        public final BankItemClickEvent copy(EcomSbpConfig.SbpBankInfo bank, Context context) {
            zdlpuopuiu.btonecajqb(bank, "bank");
            zdlpuopuiu.btonecajqb(context, "context");
            return new BankItemClickEvent(bank, context);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BankItemClickEvent)) {
                return false;
            }
            BankItemClickEvent bankItemClickEvent = (BankItemClickEvent) other;
            return zdlpuopuiu.eablkybsjg(this.bank, bankItemClickEvent.bank) && zdlpuopuiu.eablkybsjg(this.context, bankItemClickEvent.context);
        }

        public final EcomSbpConfig.SbpBankInfo getBank() {
            return this.bank;
        }

        public final Context getContext() {
            return this.context;
        }

        public int hashCode() {
            return (this.bank.hashCode() * 31) + this.context.hashCode();
        }

        public String toString() {
            return "BankItemClickEvent(bank=" + this.bank + ", context=" + this.context + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent$SearchInputChangeEvent;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchInputChangeEvent implements SbpScreenEvent {
        private final String text;

        public SearchInputChangeEvent(String text) {
            zdlpuopuiu.btonecajqb(text, "text");
            this.text = text;
        }

        public static /* synthetic */ SearchInputChangeEvent copy$default(SearchInputChangeEvent searchInputChangeEvent, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = searchInputChangeEvent.text;
            }
            return searchInputChangeEvent.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final SearchInputChangeEvent copy(String text) {
            zdlpuopuiu.btonecajqb(text, "text");
            return new SearchInputChangeEvent(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SearchInputChangeEvent) && zdlpuopuiu.eablkybsjg(this.text, ((SearchInputChangeEvent) other).text);
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "SearchInputChangeEvent(text=" + this.text + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent$SearchInputFocusChanged;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent;", "hasFocus", "", "(Z)V", "getHasFocus", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchInputFocusChanged implements SbpScreenEvent {
        private final boolean hasFocus;

        public SearchInputFocusChanged(boolean z13) {
            this.hasFocus = z13;
        }

        public static /* synthetic */ SearchInputFocusChanged copy$default(SearchInputFocusChanged searchInputFocusChanged, boolean z13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z13 = searchInputFocusChanged.hasFocus;
            }
            return searchInputFocusChanged.copy(z13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getHasFocus() {
            return this.hasFocus;
        }

        public final SearchInputFocusChanged copy(boolean hasFocus) {
            return new SearchInputFocusChanged(hasFocus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SearchInputFocusChanged) && this.hasFocus == ((SearchInputFocusChanged) other).hasFocus;
        }

        public final boolean getHasFocus() {
            return this.hasFocus;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hasFocus);
        }

        public String toString() {
            return "SearchInputFocusChanged(hasFocus=" + this.hasFocus + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent$TryToOpenBankAppFailedEvent;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getE", "()Ljava/lang/Exception;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TryToOpenBankAppFailedEvent implements SbpScreenEvent {
        private final Exception e;

        public TryToOpenBankAppFailedEvent(Exception e13) {
            zdlpuopuiu.btonecajqb(e13, "e");
            this.e = e13;
        }

        public final Exception getE() {
            return this.e;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent$TryToOpenBankWebAppFailedEvent;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getE", "()Ljava/lang/Exception;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TryToOpenBankWebAppFailedEvent implements SbpScreenEvent {
        private final Exception e;

        public TryToOpenBankWebAppFailedEvent(Exception e13) {
            zdlpuopuiu.btonecajqb(e13, "e");
            this.e = e13;
        }

        public final Exception getE() {
            return this.e;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent$TryToOpenNspkBankUriFailedEvent;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getE", "()Ljava/lang/Exception;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TryToOpenNspkBankUriFailedEvent implements SbpScreenEvent {
        private final Exception e;

        public TryToOpenNspkBankUriFailedEvent(Exception e13) {
            zdlpuopuiu.btonecajqb(e13, "e");
            this.e = e13;
        }

        public final Exception getE() {
            return this.e;
        }
    }
}
