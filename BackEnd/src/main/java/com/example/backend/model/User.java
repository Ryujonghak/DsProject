package com.example.backend.model;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@SequenceGenerator(
        name = "SQ_USER_GENERATOR"
        , sequenceName = "SQ_USER"
        , initialValue = 1
        , allocationSize = 1
)
@Table(name = "TB_USER",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "USERNAME"),
                @UniqueConstraint(columnNames = "EMAIL")
        })
@Getter
@Setter
@ToString(exclude = "role")
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
// soft delete
@Where(clause = "DELETE_YN = 'N'")
@SQLDelete(sql = "UPDATE TB_USER SET DELETE_YN = 'Y', DELETE_TIME=TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE ID = ?")
public class User extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "SQ_USER_GENERATOR"
    )
    @Column
    private Long id;

    //  로그인 ID 임
    @NotBlank
    @Size(max = 20)
    @Column
    private String username;

    @NotBlank
    @Size(max = 50)
    @Email
    @Column
    private String email;

    @NotBlank
    @Size(max = 120)
    @Column
    private String password;

    @Column
    private Integer phone;

    @Column
    private Integer year;

    @Column
    private Integer month;

    @Column
    private Integer day;

    @Column
    private String name;

    @Column
    private String answer;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "TB_USER_ROLE",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
    private Set<Role> role = new HashSet<>();

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(Long id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    //  TODO : 1) 추가
    @Builder
    public User(String username, String email, String password, Set<Role> role) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    @Builder
    public User(String username, String email, String password, Integer phone, Integer year, Integer month, Integer day, String name, String answer) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.year = year;
        this.month = month;
        this.day = day;
        this.name = name;
        this.answer = answer;
    }

    @Builder
    public User(Long id, String username, String email, String password, Integer phone, Integer year, Integer month, Integer day, String name, String answer) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.year = year;
        this.month = month;
        this.day = day;
        this.name = name;
        this.answer = answer;
    }

    public User update(String name) {
        this.username = username;

        return this;
    }
}
