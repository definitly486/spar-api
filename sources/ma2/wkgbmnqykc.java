package ma2;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.user.models.UserSharePromo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {
    public static final UserSharePromo iobyxmoadg(UserSharePromoDto userSharePromoDto) {
        zdlpuopuiu.btonecajqb(userSharePromoDto, "<this>");
        return new UserSharePromo(userSharePromoDto.getImage(), userSharePromoDto.getDescription(), userSharePromoDto.getPromocode(), userSharePromoDto.getShareMsg(), userSharePromoDto.getIsPromoAvailable());
    }
}
