package kk;

import java.util.Iterator;
import spay.sdk.RedirectActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class l8 extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public int f57413cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ va f57414iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public /* synthetic */ Object f57415jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public Iterator f57416yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public RedirectActivity f57417zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(va vaVar, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        super(wkgbmnqykcVar);
        this.f57414iwizpuwonk = vaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        this.f57415jyumaefscl = obj;
        this.f57413cqumvgiudr |= Integer.MIN_VALUE;
        return this.f57414iwizpuwonk.iobyxmoadg(null, null, this);
    }
}
