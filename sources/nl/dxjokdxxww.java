package nl;

import java.security.Key;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class dxjokdxxww extends ppxfxbqfkf {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private byte[] f70284lereixgezr;

    public dxjokdxxww(Key key) {
        super(key);
        this.f70284lereixgezr = key.getEncoded();
    }

    private String jyumaefscl() {
        return el.zoijcleaow.nufgyqmvbu(this.f70284lereixgezr);
    }

    @Override // nl.ppxfxbqfkf
    protected void iobyxmoadg(Map map, ppxfxbqfkf.zoijcleaow zoijcleaowVar) {
        if (ppxfxbqfkf.zoijcleaow.INCLUDE_SYMMETRIC.compareTo(zoijcleaowVar) >= 0) {
            map.put("k", jyumaefscl());
        }
    }

    @Override // nl.ppxfxbqfkf
    public String nufgyqmvbu() {
        return "oct";
    }

    public dxjokdxxww(Map map) {
        super(map);
        this.f70284lereixgezr = new el.zoijcleaow().iobyxmoadg(ppxfxbqfkf.draadjrbmk(map, "k"));
        this.f70295esjtqupxsv = new SecretKeySpec(this.f70284lereixgezr, "AES");
        rgvfuqvkyq("k");
    }
}
