package gxszxtbevo;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow extends gxszxtbevo.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f38661iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final List iobyxmoadg(Intent intent) {
            zdlpuopuiu.btonecajqb(intent, "<this>");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                return jyumaefscl.wflxmlrfwp();
            }
            if (clipData != null) {
                int itemCount = clipData.getItemCount();
                for (int i13 = 0; i13 < itemCount; i13++) {
                    Uri uri = clipData.getItemAt(i13).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            return new ArrayList(linkedHashSet);
        }

        private iobyxmoadg() {
        }
    }
}
