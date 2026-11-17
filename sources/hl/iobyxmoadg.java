package hl;

import il.eablkybsjg;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jose4j.json.internal.json_simple.parser.ParseException;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final jl.iobyxmoadg f40713iobyxmoadg = new C0942iobyxmoadg();

    /* JADX INFO: renamed from: hl.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C0942iobyxmoadg implements jl.iobyxmoadg {
        C0942iobyxmoadg() {
        }

        @Override // jl.iobyxmoadg
        public Map iobyxmoadg() {
            return new zoijcleaow();
        }

        @Override // jl.iobyxmoadg
        public List zoijcleaow() {
            return new ArrayList();
        }
    }

    static class zoijcleaow extends LinkedHashMap {
        zoijcleaow() {
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Object put(String str, Object obj) {
            if (!containsKey(str)) {
                return super.put(str, obj);
            }
            throw new IllegalArgumentException("An entry for '" + str + "' already exists. Names must be unique.");
        }
    }

    public static Map iobyxmoadg(String str) throws JoseException {
        try {
            Object objGxszxtbevo = new jl.zoijcleaow().gxszxtbevo(str, f40713iobyxmoadg);
            if (objGxszxtbevo != null) {
                return (Map) objGxszxtbevo;
            }
            throw new JoseException("Parsing returned null");
        } catch (ClassCastException e13) {
            throw new JoseException("Expecting a JSON object at the root but " + e13, e13);
        } catch (IllegalArgumentException e14) {
            e = e14;
            throw new JoseException("Parsing error: " + e, e);
        } catch (ParseException e15) {
            e = e15;
            throw new JoseException("Parsing error: " + e, e);
        }
    }

    public static String zoijcleaow(Map map) {
        return eablkybsjg.ppxfxbqfkf(map);
    }
}
