package spay.sdk;

import android.content.Context;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kk.ab0;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import pj.cllcsxoeiz;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends draadjrbmk implements rgvfuqvkyq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f107836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tg.draadjrbmk f107837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f107838c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, tg.draadjrbmk draadjrbmkVar, c cVar, gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f107836a = context;
        this.f107837b = draadjrbmkVar;
        this.f107838c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
        return new b(this.f107836a, this.f107837b, this.f107838c, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((cllcsxoeiz) obj, (gxszxtbevo) obj2)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        zoijcleaow.gxszxtbevo();
        zdlpuopuiu.zoijcleaow(obj);
        SPaySdkApp companion = SPaySdkApp.INSTANCE.getInstance();
        Context context = this.f107836a;
        companion.reInitialize$SPaySDK_baseRelease(context, new ab0(this.f107837b, this.f107838c, context));
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
