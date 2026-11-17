package ru.myspar.proloyalty.common.view.hint.model;

import hg.jyumaefscl;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final List f93916iobyxmoadg = jyumaefscl.rgvfuqvkyq(new HintUiModel.Text("1", "цена за 1шт при покупке 2х", "#E5F69242", "#FFFFFFFF", null, null, null, 16, null), new HintUiModel.Text("2", "Удар по ценам", "#FFFF3347", "#FFFFFFFF", null, null, null, 16, null));

    public static final List iobyxmoadg() {
        return f93916iobyxmoadg;
    }

    public static final HintUiModel zoijcleaow(HintUiModel hintUiModel, HintUiModel.iobyxmoadg size) {
        zdlpuopuiu.btonecajqb(hintUiModel, "<this>");
        zdlpuopuiu.btonecajqb(size, "size");
        if (hintUiModel instanceof HintUiModel.Text) {
            return HintUiModel.Text.ppxfxbqfkf((HintUiModel.Text) hintUiModel, null, null, null, null, size, null, null, 111, null);
        }
        if (hintUiModel instanceof HintUiModel.Animation) {
            return HintUiModel.Animation.ppxfxbqfkf((HintUiModel.Animation) hintUiModel, null, null, null, null, null, size, 31, null);
        }
        if (hintUiModel instanceof HintUiModel.Picture) {
            return HintUiModel.Picture.ppxfxbqfkf((HintUiModel.Picture) hintUiModel, null, null, null, null, null, size, 31, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
