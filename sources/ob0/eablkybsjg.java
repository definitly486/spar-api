package ob0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.Sticker;
import ru.myspar.core.domain.models.StickerUiModel;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg implements draadjrbmk {
    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public StickerUiModel invoke(Sticker model) {
        zdlpuopuiu.btonecajqb(model, "model");
        return new StickerUiModel(model.getName(), model.getIconUrl());
    }
}
