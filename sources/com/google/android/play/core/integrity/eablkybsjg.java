package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.w;
import wa.ojitshcjhn;

/* JADX INFO: loaded from: classes2.dex */
final class eablkybsjg extends ojitshcjhn {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    final /* synthetic */ ua.ppxfxbqfkf f23580cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    final /* synthetic */ lqeggnwhkg f23581esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f23582iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    final /* synthetic */ Long f23583jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    final /* synthetic */ byte[] f23584yggfygwlhe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eablkybsjg(lqeggnwhkg lqeggnwhkgVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l13, TaskCompletionSource taskCompletionSource2, ua.ppxfxbqfkf ppxfxbqfkfVar) {
        super(taskCompletionSource);
        this.f23581esjtqupxsv = lqeggnwhkgVar;
        this.f23584yggfygwlhe = bArr;
        this.f23583jyumaefscl = l13;
        this.f23582iwizpuwonk = taskCompletionSource2;
        this.f23580cqumvgiudr = ppxfxbqfkfVar;
    }

    @Override // wa.ojitshcjhn
    public final void iobyxmoadg(Exception exc) {
        if (exc instanceof w) {
            super.iobyxmoadg(new IntegrityServiceException(-9, exc));
        } else {
            super.iobyxmoadg(exc);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, wa.gtknphoqwx] */
    @Override // wa.ojitshcjhn
    protected final void zoijcleaow() {
        try {
            this.f23581esjtqupxsv.f23590ppxfxbqfkf.eablkybsjg().eablkybsjg(lqeggnwhkg.iobyxmoadg(this.f23581esjtqupxsv, this.f23584yggfygwlhe, this.f23583jyumaefscl), new gxszxtbevo(this.f23581esjtqupxsv, this.f23582iwizpuwonk));
        } catch (RemoteException e13) {
            this.f23581esjtqupxsv.f23589iobyxmoadg.ppxfxbqfkf(e13, "requestIntegrityToken(%s)", this.f23580cqumvgiudr);
            this.f23582iwizpuwonk.trySetException(new IntegrityServiceException(-100, e13));
        }
    }
}
