package modern.payments.ecomAndroid.data.provider;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.domain.provider.IpAddressProvider;
import sj.dxjokdxxww;
import sj.kegysxyocb;
import sj.wypolnanlu;
import sj.zynmafqrjb;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lmodern/payments/ecomAndroid/data/provider/IpAddressProviderImpl;", "Lmodern/payments/ecomAndroid/domain/provider/IpAddressProvider;", "<init>", "()V", "", "newIp", "Lgg/wwaezpbzkn;", "updateIpAddress", "(Ljava/lang/String;)V", "clearIpAddress", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lsj/zynmafqrjb;", "_ip", "Lsj/zynmafqrjb;", "Lsj/wypolnanlu;", "getIp", "()Lsj/wypolnanlu;", "ip", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IpAddressProviderImpl implements IpAddressProvider {
    private final zynmafqrjb _ip = kegysxyocb.iobyxmoadg(null);

    @Override // modern.payments.ecomAndroid.domain.provider.IpAddressProvider
    public Object clearIpAddress(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        this._ip.setValue(null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.provider.IpAddressProvider
    public wypolnanlu getIp() {
        return dxjokdxxww.zoijcleaow(this._ip);
    }

    @Override // modern.payments.ecomAndroid.domain.provider.IpAddressProvider
    public void updateIpAddress(String newIp) {
        zdlpuopuiu.btonecajqb(newIp, "newIp");
        CharSequence charSequence = (CharSequence) this._ip.getValue();
        if (charSequence == null || kcexrzcfyt.zfvoamnweg(charSequence) || !(zdlpuopuiu.eablkybsjg(this._ip.getValue(), newIp) || kcexrzcfyt.zfvoamnweg(newIp))) {
            this._ip.setValue(newIp);
        }
    }
}
