package i30;

import ft.zoijcleaow;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final l40.zoijcleaow f41841iobyxmoadg;

    public iobyxmoadg(l40.zoijcleaow apiEndPointsProvider) {
        zdlpuopuiu.btonecajqb(apiEndPointsProvider, "apiEndPointsProvider");
        this.f41841iobyxmoadg = apiEndPointsProvider;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.zoijcleaow
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public String iobyxmoadg(String parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        return kcexrzcfyt.q(this.f41841iobyxmoadg.nufgyqmvbu(), '/') + CardDateFormatTextWatcher.DIVIDER_CHARACTER + parameters + CardDateFormatTextWatcher.DIVIDER_CHARACTER;
    }
}
