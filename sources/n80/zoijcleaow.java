package n80;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.user.models.User;
import ru.myspar.user.models.UserCard;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {
    public final lqeggnwhkg.iobyxmoadg iobyxmoadg(m80.iobyxmoadg model) {
        UserCard userCard;
        zdlpuopuiu.btonecajqb(model, "model");
        User userZoijcleaow = model.zoijcleaow();
        String number = (userZoijcleaow == null || (userCard = userZoijcleaow.getUserCard()) == null) ? null : userCard.getNumber();
        if (number == null) {
            number = "";
        }
        return new lqeggnwhkg.iobyxmoadg(model.iobyxmoadg().iobyxmoadg(), model.iobyxmoadg().zoijcleaow(), number.length() > 0, number);
    }
}
