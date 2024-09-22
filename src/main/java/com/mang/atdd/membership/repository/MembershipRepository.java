package com.mang.atdd.membership.repository;

import com.mang.atdd.membership.entity.Membership;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

// @Repository
public interface MembershipRepository extends JpaRepository<Membership, Long> {


}
