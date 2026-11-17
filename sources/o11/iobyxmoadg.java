package o11;

import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;
import zr0.zoijcleaow;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final s21.iobyxmoadg f71549iobyxmoadg;

    public iobyxmoadg(s21.iobyxmoadg apiEndPointsProvider) {
        zdlpuopuiu.btonecajqb(apiEndPointsProvider, "apiEndPointsProvider");
        this.f71549iobyxmoadg = apiEndPointsProvider;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.zoijcleaow
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public String iobyxmoadg(String parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        return kcexrzcfyt.q(this.f71549iobyxmoadg.nufgyqmvbu(), '/') + CardDateFormatTextWatcher.DIVIDER_CHARACTER + parameters + CardDateFormatTextWatcher.DIVIDER_CHARACTER;
    }
}
