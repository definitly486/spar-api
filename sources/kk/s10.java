package kk;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* JADX INFO: loaded from: classes3.dex */
public final class s10 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ ka f58491jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ m60 f58492yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ b9 f58493zdlpuopuiu;

    public s10(b9 b9Var, m60 m60Var, ka kaVar) {
        this.f58493zdlpuopuiu = b9Var;
        this.f58492yggfygwlhe = m60Var;
        this.f58491jyumaefscl = kaVar;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, KeyManagementException {
        Object objAgtfadlqog = this.f58493zdlpuopuiu.agtfadlqog((ln) obj, this.f58492yggfygwlhe, this.f58491jyumaefscl, gxszxtbevoVar);
        return objAgtfadlqog == mg.zoijcleaow.gxszxtbevo() ? objAgtfadlqog : gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
