package com.example.gestiondenovelas.Database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005J\u0016\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012J\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/gestiondenovelas/Database/UserManager;", "", "()V", "mutableInitialNovels", "", "Lcom/example/gestiondenovelas/Novela;", "users", "Lcom/example/gestiondenovelas/User;", "addNovelaToUser", "", "username", "", "novela", "addUser", "user", "deleteNovelaFromInitial", "deleteNovelaFromUser", "getInitialNovels", "", "getNovelasForUser", "getUser", "password", "app_debug"})
public final class UserManager {
    @org.jetbrains.annotations.NotNull
    private static final java.util.List<com.example.gestiondenovelas.User> users = null;
    @org.jetbrains.annotations.NotNull
    private static final java.util.List<com.example.gestiondenovelas.Novela> mutableInitialNovels = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.gestiondenovelas.Database.UserManager INSTANCE = null;
    
    private UserManager() {
        super();
    }
    
    public final void addUser(@org.jetbrains.annotations.NotNull
    com.example.gestiondenovelas.User user) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.gestiondenovelas.User getUser(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return null;
    }
    
    public final void addNovelaToUser(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    com.example.gestiondenovelas.Novela novela) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.gestiondenovelas.Novela> getNovelasForUser(@org.jetbrains.annotations.NotNull
    java.lang.String username) {
        return null;
    }
    
    public final void deleteNovelaFromUser(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    com.example.gestiondenovelas.Novela novela) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.gestiondenovelas.Novela> getInitialNovels() {
        return null;
    }
    
    public final void deleteNovelaFromInitial(@org.jetbrains.annotations.NotNull
    com.example.gestiondenovelas.Novela novela) {
    }
}