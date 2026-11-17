package rlfsiqarku;

import android.content.ClipData;
import androidx.compose.ui.platform.opjhrmiecq;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f83119iobyxmoadg = new iobyxmoadg();

    private iobyxmoadg() {
    }

    public static final boolean iobyxmoadg(opjhrmiecq opjhrmiecqVar) {
        if (opjhrmiecqVar == null) {
            return false;
        }
        return opjhrmiecqVar.iobyxmoadg().getDescription().hasMimeType("text/*");
    }

    public static final opjhrmiecq ppxfxbqfkf(j0.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar == null) {
            return null;
        }
        return new opjhrmiecq(ClipData.newPlainText("plain text", zoijcleaow.zoijcleaow(eablkybsjgVar)));
    }

    public static final j0.eablkybsjg zoijcleaow(opjhrmiecq opjhrmiecqVar) {
        CharSequence text;
        ClipData.Item itemAt = opjhrmiecqVar.iobyxmoadg().getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return zoijcleaow.iobyxmoadg(text);
    }
}
