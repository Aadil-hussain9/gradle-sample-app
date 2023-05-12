package com.vw.restapi.repository;

import com.vw.restapi.model.Employee;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

public class UserSpecifications {

    public static Specification<Employee> search(String name, String emailId, Long userId) {
        return Specification.where(nameContains(name))
                .and(emailContains(emailId))
                .and(idEquals(userId));
    }

    private static Specification<Employee> nameContains(String name) {
        return StringUtils.isEmpty(name) ? null : (root, query, cb) ->
                cb.like(cb.lower(root.get("name")), "%" + name.toLowerCase() + "%");
    }

    private static Specification<Employee> emailContains(String emailId) {
        return StringUtils.isEmpty(emailId) ? null : (root, query, cb) ->
                cb.like(cb.lower(root.get("emailId")), "%" + emailId.toLowerCase() + "%");
    }

    private static Specification<Employee> idEquals(Long userId) {
        return userId == null ? null : (root, query, cb) -> cb.equal(root.get("userId"), userId);
    }
}