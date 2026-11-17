package vo0;

import kotlin.NoWhenBranchMatchedException;
import ru.myspar.proloyalty.cart.impl.presentation.model.ReferenceUiModel;
import ru.myspar.proloyalty.core.domain.models.reference.Reference;

/* JADX INFO: loaded from: classes5.dex */
public final class iwizpuwonk implements tg.draadjrbmk {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f117591iobyxmoadg;

        static {
            int[] iArr = new int[e01.iobyxmoadg.values().length];
            try {
                iArr[e01.iobyxmoadg.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e01.iobyxmoadg.RADIO_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e01.iobyxmoadg.CHECKBOX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e01.iobyxmoadg.CHECKBOX_TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f117591iobyxmoadg = iArr;
        }
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public ReferenceUiModel invoke(Reference domainModel) {
        String name;
        int i13;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(domainModel, "domainModel");
        e01.iobyxmoadg type = domainModel.getType();
        int[] iArr = iobyxmoadg.f117591iobyxmoadg;
        int i14 = iArr[type.ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            name = domainModel.getName();
        } else {
            if (i14 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            name = domainModel.getText();
        }
        int i15 = iArr[domainModel.getType().ordinal()];
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i13 = b31.gxszxtbevo.ic_check_16;
        } else {
            if (i15 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = b31.gxszxtbevo.ic_chat_16;
        }
        return new ReferenceUiModel(i13, name);
    }
}
