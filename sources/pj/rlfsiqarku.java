package pj;

/* JADX INFO: loaded from: classes3.dex */
final class rlfsiqarku implements zeieaojujs {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final boolean f76768zdlpuopuiu;

    public rlfsiqarku(boolean z13) {
        this.f76768zdlpuopuiu = z13;
    }

    @Override // pj.zeieaojujs
    public boolean isActive() {
        return this.f76768zdlpuopuiu;
    }

    @Override // pj.zeieaojujs
    public fyldjkxazc ppxfxbqfkf() {
        return null;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Empty{");
        sb3.append(isActive() ? "Active" : "New");
        sb3.append('}');
        return sb3.toString();
    }
}
