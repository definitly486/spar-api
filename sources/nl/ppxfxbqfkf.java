package nl;

import java.io.Serializable;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf implements Serializable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    protected Map f70294cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    protected Key f70295esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private List f70296iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private String f70297jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private String f70298yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private String f70299zdlpuopuiu;

    public static class iobyxmoadg {
        public static ppxfxbqfkf iobyxmoadg(String str) {
            return ppxfxbqfkf(hl.iobyxmoadg.iobyxmoadg(str));
        }

        public static ppxfxbqfkf ppxfxbqfkf(Map map) throws JoseException {
            String strDraadjrbmk = ppxfxbqfkf.draadjrbmk(map, "kty");
            strDraadjrbmk.hashCode();
            switch (strDraadjrbmk) {
                case "EC":
                    return new nl.zoijcleaow(map);
                case "OKP":
                    return new nufgyqmvbu(map);
                case "RSA":
                    return new draadjrbmk(map);
                case "oct":
                    return new dxjokdxxww(map);
                default:
                    throw new JoseException("Unknown key type algorithm: '" + strDraadjrbmk + "'");
            }
        }

        public static ppxfxbqfkf zoijcleaow(Key key) throws JoseException {
            if (RSAPublicKey.class.isInstance(key)) {
                return new draadjrbmk((RSAPublicKey) key);
            }
            if (ECPublicKey.class.isInstance(key)) {
                return new nl.zoijcleaow((ECPublicKey) key);
            }
            if (!PublicKey.class.isInstance(key)) {
                if (PrivateKey.class.isInstance(key)) {
                    throw new JoseException("A JsonWebKey instance needs to be created from a public or symmetric key.");
                }
                return new dxjokdxxww(key);
            }
            if (nufgyqmvbu.ylkuphrtab(key)) {
                return new nufgyqmvbu((PublicKey) key);
            }
            throw new JoseException("Unsupported or unknown public key (alg=" + key.getAlgorithm() + ") " + key);
        }
    }

    public enum zoijcleaow {
        INCLUDE_PRIVATE,
        INCLUDE_SYMMETRIC,
        PUBLIC_ONLY
    }

    protected ppxfxbqfkf(Key key) {
        this.f70294cqumvgiudr = new LinkedHashMap();
        this.f70295esjtqupxsv = key;
    }

    protected static String btonecajqb(Map map, String str, boolean z13) throws JoseException {
        String strDxjokdxxww = dxjokdxxww(map, str);
        if (strDxjokdxxww != null || !z13) {
            return strDxjokdxxww;
        }
        throw new JoseException("Missing required '" + str + "' parameter.");
    }

    protected static String draadjrbmk(Map map, String str) {
        return btonecajqb(map, str, true);
    }

    protected static String dxjokdxxww(Map map, String str) {
        return rl.wkgbmnqykc.wkgbmnqykc(map, str);
    }

    public String agtfadlqog() {
        return this.f70299zdlpuopuiu;
    }

    public String getAlgorithm() {
        return this.f70297jyumaefscl;
    }

    protected abstract void iobyxmoadg(Map map, zoijcleaow zoijcleaowVar);

    public void kcexrzcfyt(String str) {
        this.f70298yggfygwlhe = str;
    }

    public String lqeggnwhkg() {
        return this.f70298yggfygwlhe;
    }

    public abstract String nufgyqmvbu();

    protected void ojitshcjhn(String str, Object obj, Map map) {
        if (obj != null) {
            map.put(str, obj);
        }
    }

    protected void rgvfuqvkyq(String... strArr) {
        for (String str : strArr) {
            this.f70294cqumvgiudr.remove(str);
        }
    }

    public String toString() {
        return getClass().getName() + yggfygwlhe(zoijcleaow.PUBLIC_ONLY);
    }

    public void vdvldrhtss(String str) {
        this.f70297jyumaefscl = str;
    }

    public Key wkgbmnqykc() {
        return this.f70295esjtqupxsv;
    }

    public Map yggfygwlhe(zoijcleaow zoijcleaowVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("kty", nufgyqmvbu());
        ojitshcjhn("kid", lqeggnwhkg(), linkedHashMap);
        ojitshcjhn("use", agtfadlqog(), linkedHashMap);
        ojitshcjhn("key_ops", this.f70296iwizpuwonk, linkedHashMap);
        ojitshcjhn("alg", getAlgorithm(), linkedHashMap);
        iobyxmoadg(linkedHashMap, zoijcleaowVar);
        linkedHashMap.putAll(this.f70294cqumvgiudr);
        return linkedHashMap;
    }

    public void zdlpuopuiu(String str) {
        this.f70299zdlpuopuiu = str;
    }

    protected ppxfxbqfkf(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f70294cqumvgiudr = linkedHashMap;
        linkedHashMap.putAll(map);
        rgvfuqvkyq("kty", "use", "kid", "alg", "key_ops");
        zdlpuopuiu(dxjokdxxww(map, "use"));
        kcexrzcfyt(dxjokdxxww(map, "kid"));
        vdvldrhtss(dxjokdxxww(map, "alg"));
        if (map.containsKey("key_ops")) {
            this.f70296iwizpuwonk = rl.wkgbmnqykc.ppxfxbqfkf(map, "key_ops");
        }
    }
}
