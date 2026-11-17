package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import ua.vdvldrhtss;
import wa.agtfadlqog;
import wa.esjtqupxsv;
import wa.pmvmpeiblj;

/* JADX INFO: loaded from: classes2.dex */
final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final agtfadlqog f23589iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final esjtqupxsv f23590ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f23591zoijcleaow;

    lqeggnwhkg(Context context, agtfadlqog agtfadlqogVar) {
        this.f23591zoijcleaow = context.getPackageName();
        this.f23589iobyxmoadg = agtfadlqogVar;
        if (pmvmpeiblj.iobyxmoadg(context)) {
            this.f23590ppxfxbqfkf = new esjtqupxsv(context, agtfadlqogVar, "IntegrityService", nufgyqmvbu.f23592iobyxmoadg, vdvldrhtss.f113054iobyxmoadg, null, null);
        } else {
            agtfadlqogVar.zoijcleaow("Phonesky is not installed.", new Object[0]);
            this.f23590ppxfxbqfkf = null;
        }
    }

    static /* bridge */ /* synthetic */ Bundle iobyxmoadg(lqeggnwhkg lqeggnwhkgVar, byte[] bArr, Long l13) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", lqeggnwhkgVar.f23591zoijcleaow);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 1);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l13 != null) {
            bundle.putLong("cloud.prj", l13.longValue());
        }
        ArrayList<wa.nufgyqmvbu> arrayList = new ArrayList();
        arrayList.add(wa.nufgyqmvbu.ppxfxbqfkf(3, System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        for (wa.nufgyqmvbu nufgyqmvbuVar : arrayList) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", nufgyqmvbuVar.zoijcleaow());
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }

    public final Task zoijcleaow(ua.ppxfxbqfkf ppxfxbqfkfVar) {
        if (this.f23590ppxfxbqfkf == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(ppxfxbqfkfVar.ppxfxbqfkf(), 10);
            Long lZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
            this.f23589iobyxmoadg.wkgbmnqykc("requestIntegrityToken(%s)", ppxfxbqfkfVar);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f23590ppxfxbqfkf.rgvfuqvkyq(new eablkybsjg(this, taskCompletionSource, bArrDecode, lZoijcleaow, taskCompletionSource, ppxfxbqfkfVar), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e13) {
            return Tasks.forException(new IntegrityServiceException(-13, e13));
        }
    }
}
