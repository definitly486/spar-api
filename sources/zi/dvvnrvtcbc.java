package zi;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dvvnrvtcbc implements iwxlajgraz {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwxlajgraz)) {
            return false;
        }
        iwxlajgraz iwxlajgrazVar = (iwxlajgraz) obj;
        return zoijcleaow() == iwxlajgrazVar.zoijcleaow() && ppxfxbqfkf() == iwxlajgrazVar.ppxfxbqfkf() && getType().equals(iwxlajgrazVar.getType());
    }

    public int hashCode() {
        int iHashCode = ppxfxbqfkf().hashCode();
        if (ageimvtcrz.iwizpuwonk(getType())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (zoijcleaow() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (zoijcleaow()) {
            return "*";
        }
        if (ppxfxbqfkf() == mhtqkkgtqm.INVARIANT) {
            return getType().toString();
        }
        return ppxfxbqfkf() + " " + getType();
    }
}
