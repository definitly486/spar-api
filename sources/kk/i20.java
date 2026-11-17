package kk;

import android.content.Intent;
import spay.sdk.RedirectActivity;
import spay.sdk.domain.model.FakeBankAuthData;

/* JADX INFO: loaded from: classes3.dex */
public final class i20 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.p6 f56981zdlpuopuiu;

    public i20(npi.spay.p6 p6Var) {
        this.f56981zdlpuopuiu = p6Var;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        this.f56981zdlpuopuiu.requireActivity().startActivity(new Intent(this.f56981zdlpuopuiu.getContext(), (Class<?>) RedirectActivity.class).putExtra("FAKE_BANK_AUTH_INTENT_KEY", (FakeBankAuthData) obj));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
