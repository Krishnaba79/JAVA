}

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.model.Mother;
import com.example.model.Child;

@Repository
public class MotherChildDaoImpl implements MotherChildDao {

    @Autowired
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void addMother(Mother mother) {
        String sql = "INSERT INTO mothers (name) VALUES (?)";
        try (Connection conn = dataSource.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, mother.getName());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addChild(Child child) {
        String sql = "INSERT INTO children (name, mother_id) VALUES (?, ?)";
        try (Connection conn = dataSource.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, child.getName());
            ps.setInt(2, child.getMotherId());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Mother> getAllMothers() {
        String sql = "SELECT * FROM mothers";
        List<Mother> mothers = new ArrayList<>();
        try (Connection conn = dataSource.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Mother mother = new Mother();
                mother.setId(rs.getInt("id"));
                mother.setName(rs.getString("name"));
                mothers.add(mother);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return mothers;
    }

    @Override
    public List<Child> getAllChildren() {
        String sql = "SELECT * FROM children";
        List<Child> children = new ArrayList<>();
        try (Connection conn = dataSource.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Child child = new Child();
                child.setId(rs.getInt("id"));
                child.setName(rs.getString("name"));
                child.setMotherId(rs.getInt("mother_id"));
                children.add(child);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return children;
    }

    @Override
    public void updateMother(Mother mother) {
        String sql = "UPDATE mothers SET name=? WHERE id=?";
        try (Connection conn = dataSource.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, mother.getName());
            ps.setInt(2, mother.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateChild(Child child) {
        String sql = "UPDATE children SET name=?, mother_id=? WHERE id=?";
        try (Connection conn = dataSource.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, child.getName());
            ps.setInt(2, child.getMotherId());
            ps.setInt(3, child.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteMother(int id) {
        String sql = "DELETE FROM mothers WHERE id=?";
        try (Connection conn = dataSource.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteChild(int id) {
        String sql = "DELETE FROM children WHERE id=?";
        try (Connection conn = dataSource.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}