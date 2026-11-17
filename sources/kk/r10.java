package kk;

import android.net.Uri;
import npi.spay.Ln;

/* JADX INFO: loaded from: classes3.dex */
public final class r10 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.rj f58259zdlpuopuiu;

    public r10(npi.spay.rj rjVar) {
        this.f58259zdlpuopuiu = rjVar;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        Uri uri = (Uri) obj;
        if (uri == null) {
            npi.spay.rj rjVar = this.f58259zdlpuopuiu;
            int i13 = npi.spay.rj.f70583cqumvgiudr;
            a6.iobyxmoadg iobyxmoadgVar = rjVar.f70570yggfygwlhe;
            if (iobyxmoadgVar == null) {
                throw Ln.f70555zdlpuopuiu;
            }
            s70 s70Var = (s70) iobyxmoadgVar;
            s70Var.f58528ppxfxbqfkf.setVisibility(8);
            s70Var.f58529zoijcleaow.setVisibility(0);
            pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.oxmwwwfdhm.iobyxmoadg(rjVar), null, null, new g50(rjVar, null), 3, null);
        } else {
            npi.spay.rj rjVar2 = this.f58259zdlpuopuiu;
            String string = uri.toString();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "uri.toString()");
            int i14 = npi.spay.rj.f70583cqumvgiudr;
            a6.iobyxmoadg iobyxmoadgVar2 = rjVar2.f70570yggfygwlhe;
            if (iobyxmoadgVar2 == null) {
                throw Ln.f70555zdlpuopuiu;
            }
            s70 s70Var2 = (s70) iobyxmoadgVar2;
            s70Var2.f58529zoijcleaow.setVisibility(8);
            s70Var2.f58528ppxfxbqfkf.setVisibility(0);
            s70Var2.f58528ppxfxbqfkf.setWebViewClient(new i60(rjVar2, rjVar2.requireContext()));
            s70Var2.f58528ppxfxbqfkf.loadUrl(string);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
