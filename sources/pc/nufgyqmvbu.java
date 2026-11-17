package pc;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f76369iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final mc.ppxfxbqfkf f76370ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f76371zoijcleaow;

    public static final class iobyxmoadg implements nc.zoijcleaow {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final mc.ppxfxbqfkf f76372wkgbmnqykc = new mc.ppxfxbqfkf() { // from class: pc.lqeggnwhkg
            @Override // mc.ppxfxbqfkf
            public final void encode(Object obj, Object obj2) {
                nufgyqmvbu.iobyxmoadg.wkgbmnqykc(obj, (mc.wkgbmnqykc) obj2);
            }
        };

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Map f76373iobyxmoadg = new HashMap();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Map f76375zoijcleaow = new HashMap();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private mc.ppxfxbqfkf f76374ppxfxbqfkf = f76372wkgbmnqykc;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void wkgbmnqykc(Object obj, mc.wkgbmnqykc wkgbmnqykcVar) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        @Override // nc.zoijcleaow
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg registerEncoder(Class cls, mc.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f76373iobyxmoadg.put(cls, ppxfxbqfkfVar);
            this.f76375zoijcleaow.remove(cls);
            return this;
        }

        public iobyxmoadg ppxfxbqfkf(nc.iobyxmoadg iobyxmoadgVar) {
            iobyxmoadgVar.configure(this);
            return this;
        }

        public nufgyqmvbu zoijcleaow() {
            return new nufgyqmvbu(new HashMap(this.f76373iobyxmoadg), new HashMap(this.f76375zoijcleaow), this.f76374ppxfxbqfkf);
        }
    }

    nufgyqmvbu(Map map, Map map2, mc.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f76369iobyxmoadg = map;
        this.f76371zoijcleaow = map2;
        this.f76370ppxfxbqfkf = ppxfxbqfkfVar;
    }

    public static iobyxmoadg iobyxmoadg() {
        return new iobyxmoadg();
    }

    public byte[] ppxfxbqfkf(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            zoijcleaow(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public void zoijcleaow(Object obj, OutputStream outputStream) {
        new gxszxtbevo(outputStream, this.f76369iobyxmoadg, this.f76371zoijcleaow, this.f76370ppxfxbqfkf).ojitshcjhn(obj);
    }
}
