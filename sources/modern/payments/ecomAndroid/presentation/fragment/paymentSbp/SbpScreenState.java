package modern.payments.ecomAndroid.presentation.fragment.paymentSbp;

import hg.jyumaefscl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.model.response.EcomSbpConfig;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenState;", "", "visibleBanks", "", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;", "searchInput", "", "(Ljava/util/List;Ljava/lang/String;)V", "getSearchInput", "()Ljava/lang/String;", "getVisibleBanks", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SbpScreenState {
    private final String searchInput;
    private final List<EcomSbpConfig.SbpBankInfo> visibleBanks;

    /* JADX WARN: Multi-variable type inference failed */
    public SbpScreenState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SbpScreenState copy$default(SbpScreenState sbpScreenState, List list, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = sbpScreenState.visibleBanks;
        }
        if ((i13 & 2) != 0) {
            str = sbpScreenState.searchInput;
        }
        return sbpScreenState.copy(list, str);
    }

    public final List<EcomSbpConfig.SbpBankInfo> component1() {
        return this.visibleBanks;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSearchInput() {
        return this.searchInput;
    }

    public final SbpScreenState copy(List<EcomSbpConfig.SbpBankInfo> visibleBanks, String searchInput) {
        zdlpuopuiu.btonecajqb(visibleBanks, "visibleBanks");
        zdlpuopuiu.btonecajqb(searchInput, "searchInput");
        return new SbpScreenState(visibleBanks, searchInput);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SbpScreenState)) {
            return false;
        }
        SbpScreenState sbpScreenState = (SbpScreenState) other;
        return zdlpuopuiu.eablkybsjg(this.visibleBanks, sbpScreenState.visibleBanks) && zdlpuopuiu.eablkybsjg(this.searchInput, sbpScreenState.searchInput);
    }

    public final String getSearchInput() {
        return this.searchInput;
    }

    public final List<EcomSbpConfig.SbpBankInfo> getVisibleBanks() {
        return this.visibleBanks;
    }

    public int hashCode() {
        return (this.visibleBanks.hashCode() * 31) + this.searchInput.hashCode();
    }

    public String toString() {
        return "SbpScreenState(visibleBanks=" + this.visibleBanks + ", searchInput=" + this.searchInput + ')';
    }

    public SbpScreenState(List<EcomSbpConfig.SbpBankInfo> visibleBanks, String searchInput) {
        zdlpuopuiu.btonecajqb(visibleBanks, "visibleBanks");
        zdlpuopuiu.btonecajqb(searchInput, "searchInput");
        this.visibleBanks = visibleBanks;
        this.searchInput = searchInput;
    }

    public /* synthetic */ SbpScreenState(List list, String str, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 2) != 0 ? "" : str);
    }
}
