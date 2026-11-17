package f2;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f32597iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final gxszxtbevo iobyxmoadg(InputStream input) throws CorruptionException {
            zdlpuopuiu.btonecajqb(input, "input");
            try {
                gxszxtbevo gxszxtbevoVarPkzmftpjix = gxszxtbevo.pkzmftpjix(input);
                zdlpuopuiu.dxjokdxxww(gxszxtbevoVarPkzmftpjix, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return gxszxtbevoVarPkzmftpjix;
            } catch (InvalidProtocolBufferException e13) {
                throw new CorruptionException("Unable to parse preferences proto.", e13);
            }
        }

        private iobyxmoadg() {
        }
    }
}
