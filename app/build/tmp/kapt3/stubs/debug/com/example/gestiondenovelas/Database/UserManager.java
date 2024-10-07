package com.example.gestiondenovelas.Database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007J\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011J\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u0005J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/gestiondenovelas/Database/UserManager;", "", "()V", "userNovelas", "", "", "", "Lcom/example/gestiondenovelas/Novela;", "users", "Lcom/example/gestiondenovelas/User;", "addNovelaToUser", "", "userName", "novela", "deleteNovelaFromInitial", "deleteNovelaFromUser", "getInitialNovels", "", "getNovelasForUser", "getUser", "username", "password", "app_debug"})
public final class UserManager {
    @org.jetbrains.annotations.NotNull
    private static final java.util.List<com.example.gestiondenovelas.User> users = null;
    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, java.util.List<com.example.gestiondenovelas.Novela>> userNovelas = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.gestiondenovelas.Database.UserManager INSTANCE = null;
    
    private UserManager() {
        super();
    }
    
    public final void addNovelaToUser(@org.jetbrains.annotations.NotNull
    java.lang.String userName, @org.jetbrains.annotations.NotNull
    com.example.gestiondenovelas.Novela novela) {
    }
    
    public final void deleteNovelaFromUser(@org.jetbrains.annotations.NotNull
    java.lang.String userName, @org.jetbrains.annotations.NotNull
    com.example.gestiondenovelas.Novela novela) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.gestiondenovelas.Novela> getNovelasForUser(@org.jetbrains.annotations.NotNull
    java.lang.String userName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.gestiondenovelas.Novela> getInitialNovels() {
        return null;
    }
    
    public final void deleteNovelaFromInitial(@org.jetbrains.annotations.NotNull
    com.example.gestiondenovelas.Novela novela) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.gestiondenovelas.User getUser(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return null;
    }
}